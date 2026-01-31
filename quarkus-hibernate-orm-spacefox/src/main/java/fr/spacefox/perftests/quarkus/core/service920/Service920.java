package fr.spacefox.perftests.quarkus.core.service920;

import fr.spacefox.perftests.quarkus.core.port.data.Entity920DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service920.model.Model920;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service920 {

    private final Entity920DatasourcePort datasource;

    public Service920(Entity920DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model920 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
