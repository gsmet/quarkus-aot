package fr.spacefox.perftests.quarkus.core.service737;

import fr.spacefox.perftests.quarkus.core.port.data.Entity737DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service737.model.Model737;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service737 {

    private final Entity737DatasourcePort datasource;

    public Service737(Entity737DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model737 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
