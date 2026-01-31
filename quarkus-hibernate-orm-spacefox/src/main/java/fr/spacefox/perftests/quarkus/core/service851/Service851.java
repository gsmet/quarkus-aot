package fr.spacefox.perftests.quarkus.core.service851;

import fr.spacefox.perftests.quarkus.core.port.data.Entity851DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service851.model.Model851;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service851 {

    private final Entity851DatasourcePort datasource;

    public Service851(Entity851DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model851 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
