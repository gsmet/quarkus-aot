package fr.spacefox.perftests.quarkus.core.service738;

import fr.spacefox.perftests.quarkus.core.port.data.Entity738DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service738.model.Model738;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service738 {

    private final Entity738DatasourcePort datasource;

    public Service738(Entity738DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model738 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
