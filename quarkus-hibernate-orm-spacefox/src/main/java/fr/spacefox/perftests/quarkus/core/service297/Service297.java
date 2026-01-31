package fr.spacefox.perftests.quarkus.core.service297;

import fr.spacefox.perftests.quarkus.core.port.data.Entity297DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service297.model.Model297;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service297 {

    private final Entity297DatasourcePort datasource;

    public Service297(Entity297DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model297 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
