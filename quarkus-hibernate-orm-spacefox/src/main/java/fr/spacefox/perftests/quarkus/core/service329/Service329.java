package fr.spacefox.perftests.quarkus.core.service329;

import fr.spacefox.perftests.quarkus.core.port.data.Entity329DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service329.model.Model329;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service329 {

    private final Entity329DatasourcePort datasource;

    public Service329(Entity329DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model329 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
