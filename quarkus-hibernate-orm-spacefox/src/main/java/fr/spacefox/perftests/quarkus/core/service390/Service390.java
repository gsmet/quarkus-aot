package fr.spacefox.perftests.quarkus.core.service390;

import fr.spacefox.perftests.quarkus.core.port.data.Entity390DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service390.model.Model390;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service390 {

    private final Entity390DatasourcePort datasource;

    public Service390(Entity390DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model390 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
