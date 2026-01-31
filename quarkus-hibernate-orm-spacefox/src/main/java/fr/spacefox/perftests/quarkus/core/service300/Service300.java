package fr.spacefox.perftests.quarkus.core.service300;

import fr.spacefox.perftests.quarkus.core.port.data.Entity300DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service300.model.Model300;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service300 {

    private final Entity300DatasourcePort datasource;

    public Service300(Entity300DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model300 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
