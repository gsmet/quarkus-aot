package fr.spacefox.perftests.quarkus.core.service427;

import fr.spacefox.perftests.quarkus.core.port.data.Entity427DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service427.model.Model427;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service427 {

    private final Entity427DatasourcePort datasource;

    public Service427(Entity427DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model427 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
