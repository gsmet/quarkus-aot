package fr.spacefox.perftests.quarkus.core.service551;

import fr.spacefox.perftests.quarkus.core.port.data.Entity551DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service551.model.Model551;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service551 {

    private final Entity551DatasourcePort datasource;

    public Service551(Entity551DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model551 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
