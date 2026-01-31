package fr.spacefox.perftests.quarkus.core.service423;

import fr.spacefox.perftests.quarkus.core.port.data.Entity423DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service423.model.Model423;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service423 {

    private final Entity423DatasourcePort datasource;

    public Service423(Entity423DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model423 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
