package fr.spacefox.perftests.quarkus.core.service217;

import fr.spacefox.perftests.quarkus.core.port.data.Entity217DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service217.model.Model217;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service217 {

    private final Entity217DatasourcePort datasource;

    public Service217(Entity217DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model217 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
