package fr.spacefox.perftests.quarkus.core.service457;

import fr.spacefox.perftests.quarkus.core.port.data.Entity457DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service457.model.Model457;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service457 {

    private final Entity457DatasourcePort datasource;

    public Service457(Entity457DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model457 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
