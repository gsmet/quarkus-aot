package fr.spacefox.perftests.quarkus.core.service35;

import fr.spacefox.perftests.quarkus.core.port.data.Entity35DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service35.model.Model35;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service35 {

    private final Entity35DatasourcePort datasource;

    public Service35(Entity35DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model35 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
