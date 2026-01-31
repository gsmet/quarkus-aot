package fr.spacefox.perftests.quarkus.core.service446;

import fr.spacefox.perftests.quarkus.core.port.data.Entity446DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service446.model.Model446;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service446 {

    private final Entity446DatasourcePort datasource;

    public Service446(Entity446DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model446 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
