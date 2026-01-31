package fr.spacefox.perftests.quarkus.core.service719;

import fr.spacefox.perftests.quarkus.core.port.data.Entity719DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service719.model.Model719;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service719 {

    private final Entity719DatasourcePort datasource;

    public Service719(Entity719DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model719 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
