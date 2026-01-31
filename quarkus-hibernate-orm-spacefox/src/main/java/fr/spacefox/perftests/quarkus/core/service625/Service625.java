package fr.spacefox.perftests.quarkus.core.service625;

import fr.spacefox.perftests.quarkus.core.port.data.Entity625DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service625.model.Model625;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service625 {

    private final Entity625DatasourcePort datasource;

    public Service625(Entity625DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model625 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
