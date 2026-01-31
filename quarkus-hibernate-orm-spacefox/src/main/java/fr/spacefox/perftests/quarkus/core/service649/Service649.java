package fr.spacefox.perftests.quarkus.core.service649;

import fr.spacefox.perftests.quarkus.core.port.data.Entity649DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service649.model.Model649;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service649 {

    private final Entity649DatasourcePort datasource;

    public Service649(Entity649DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model649 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
