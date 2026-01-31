package fr.spacefox.perftests.quarkus.core.service878;

import fr.spacefox.perftests.quarkus.core.port.data.Entity878DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service878.model.Model878;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service878 {

    private final Entity878DatasourcePort datasource;

    public Service878(Entity878DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model878 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
