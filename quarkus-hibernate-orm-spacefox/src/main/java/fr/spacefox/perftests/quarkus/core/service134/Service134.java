package fr.spacefox.perftests.quarkus.core.service134;

import fr.spacefox.perftests.quarkus.core.port.data.Entity134DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service134.model.Model134;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service134 {

    private final Entity134DatasourcePort datasource;

    public Service134(Entity134DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model134 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
