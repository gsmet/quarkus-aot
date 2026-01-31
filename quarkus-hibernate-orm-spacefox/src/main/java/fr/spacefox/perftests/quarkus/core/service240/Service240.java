package fr.spacefox.perftests.quarkus.core.service240;

import fr.spacefox.perftests.quarkus.core.port.data.Entity240DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service240.model.Model240;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service240 {

    private final Entity240DatasourcePort datasource;

    public Service240(Entity240DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model240 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
