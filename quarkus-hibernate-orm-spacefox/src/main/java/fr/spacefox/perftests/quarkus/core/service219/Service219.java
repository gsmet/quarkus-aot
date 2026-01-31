package fr.spacefox.perftests.quarkus.core.service219;

import fr.spacefox.perftests.quarkus.core.port.data.Entity219DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service219.model.Model219;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service219 {

    private final Entity219DatasourcePort datasource;

    public Service219(Entity219DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model219 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
