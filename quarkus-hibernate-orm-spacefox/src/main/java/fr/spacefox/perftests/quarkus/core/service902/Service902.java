package fr.spacefox.perftests.quarkus.core.service902;

import fr.spacefox.perftests.quarkus.core.port.data.Entity902DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service902.model.Model902;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service902 {

    private final Entity902DatasourcePort datasource;

    public Service902(Entity902DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model902 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
