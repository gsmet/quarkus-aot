package fr.spacefox.perftests.quarkus.core.service19;

import fr.spacefox.perftests.quarkus.core.port.data.Entity19DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service19.model.Model19;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service19 {

    private final Entity19DatasourcePort datasource;

    public Service19(Entity19DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model19 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
