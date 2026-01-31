package fr.spacefox.perftests.quarkus.core.service77;

import fr.spacefox.perftests.quarkus.core.port.data.Entity77DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service77.model.Model77;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service77 {

    private final Entity77DatasourcePort datasource;

    public Service77(Entity77DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model77 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
