package fr.spacefox.perftests.quarkus.core.service856;

import fr.spacefox.perftests.quarkus.core.port.data.Entity856DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service856.model.Model856;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service856 {

    private final Entity856DatasourcePort datasource;

    public Service856(Entity856DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model856 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
