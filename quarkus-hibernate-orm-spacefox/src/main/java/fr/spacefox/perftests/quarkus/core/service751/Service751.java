package fr.spacefox.perftests.quarkus.core.service751;

import fr.spacefox.perftests.quarkus.core.port.data.Entity751DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service751.model.Model751;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service751 {

    private final Entity751DatasourcePort datasource;

    public Service751(Entity751DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model751 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
