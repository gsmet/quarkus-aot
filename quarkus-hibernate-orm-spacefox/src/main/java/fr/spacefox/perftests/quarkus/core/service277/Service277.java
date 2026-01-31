package fr.spacefox.perftests.quarkus.core.service277;

import fr.spacefox.perftests.quarkus.core.port.data.Entity277DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service277.model.Model277;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service277 {

    private final Entity277DatasourcePort datasource;

    public Service277(Entity277DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model277 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
