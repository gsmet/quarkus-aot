package fr.spacefox.perftests.quarkus.core.service987;

import fr.spacefox.perftests.quarkus.core.port.data.Entity987DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service987.model.Model987;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service987 {

    private final Entity987DatasourcePort datasource;

    public Service987(Entity987DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model987 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
