package fr.spacefox.perftests.quarkus.core.service239;

import fr.spacefox.perftests.quarkus.core.port.data.Entity239DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service239.model.Model239;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service239 {

    private final Entity239DatasourcePort datasource;

    public Service239(Entity239DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model239 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
