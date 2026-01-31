package fr.spacefox.perftests.quarkus.core.service831;

import fr.spacefox.perftests.quarkus.core.port.data.Entity831DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service831.model.Model831;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service831 {

    private final Entity831DatasourcePort datasource;

    public Service831(Entity831DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model831 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
