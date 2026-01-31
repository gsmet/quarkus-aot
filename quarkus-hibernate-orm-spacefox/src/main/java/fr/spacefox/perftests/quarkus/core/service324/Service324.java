package fr.spacefox.perftests.quarkus.core.service324;

import fr.spacefox.perftests.quarkus.core.port.data.Entity324DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service324.model.Model324;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service324 {

    private final Entity324DatasourcePort datasource;

    public Service324(Entity324DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model324 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
