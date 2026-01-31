package fr.spacefox.perftests.quarkus.core.service131;

import fr.spacefox.perftests.quarkus.core.port.data.Entity131DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service131.model.Model131;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service131 {

    private final Entity131DatasourcePort datasource;

    public Service131(Entity131DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model131 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
