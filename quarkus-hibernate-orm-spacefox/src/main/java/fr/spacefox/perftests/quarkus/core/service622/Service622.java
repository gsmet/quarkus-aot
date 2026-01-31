package fr.spacefox.perftests.quarkus.core.service622;

import fr.spacefox.perftests.quarkus.core.port.data.Entity622DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service622.model.Model622;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service622 {

    private final Entity622DatasourcePort datasource;

    public Service622(Entity622DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model622 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
