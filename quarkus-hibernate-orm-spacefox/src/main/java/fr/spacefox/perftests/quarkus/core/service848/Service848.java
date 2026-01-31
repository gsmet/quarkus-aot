package fr.spacefox.perftests.quarkus.core.service848;

import fr.spacefox.perftests.quarkus.core.port.data.Entity848DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service848.model.Model848;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service848 {

    private final Entity848DatasourcePort datasource;

    public Service848(Entity848DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model848 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
