package fr.spacefox.perftests.quarkus.core.service352;

import fr.spacefox.perftests.quarkus.core.port.data.Entity352DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service352.model.Model352;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service352 {

    private final Entity352DatasourcePort datasource;

    public Service352(Entity352DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model352 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
