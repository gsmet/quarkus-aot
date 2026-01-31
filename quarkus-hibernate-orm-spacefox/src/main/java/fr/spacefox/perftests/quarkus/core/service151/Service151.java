package fr.spacefox.perftests.quarkus.core.service151;

import fr.spacefox.perftests.quarkus.core.port.data.Entity151DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service151.model.Model151;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service151 {

    private final Entity151DatasourcePort datasource;

    public Service151(Entity151DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model151 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
