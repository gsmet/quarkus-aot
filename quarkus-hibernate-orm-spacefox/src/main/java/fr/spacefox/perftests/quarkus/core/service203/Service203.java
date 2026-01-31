package fr.spacefox.perftests.quarkus.core.service203;

import fr.spacefox.perftests.quarkus.core.port.data.Entity203DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service203.model.Model203;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service203 {

    private final Entity203DatasourcePort datasource;

    public Service203(Entity203DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model203 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
