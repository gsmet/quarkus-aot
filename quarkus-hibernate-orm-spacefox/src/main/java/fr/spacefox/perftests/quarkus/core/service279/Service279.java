package fr.spacefox.perftests.quarkus.core.service279;

import fr.spacefox.perftests.quarkus.core.port.data.Entity279DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service279.model.Model279;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service279 {

    private final Entity279DatasourcePort datasource;

    public Service279(Entity279DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model279 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
