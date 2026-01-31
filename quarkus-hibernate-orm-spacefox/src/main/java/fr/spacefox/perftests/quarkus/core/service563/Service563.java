package fr.spacefox.perftests.quarkus.core.service563;

import fr.spacefox.perftests.quarkus.core.port.data.Entity563DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service563.model.Model563;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service563 {

    private final Entity563DatasourcePort datasource;

    public Service563(Entity563DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model563 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
