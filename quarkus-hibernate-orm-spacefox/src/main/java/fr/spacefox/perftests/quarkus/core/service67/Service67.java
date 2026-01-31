package fr.spacefox.perftests.quarkus.core.service67;

import fr.spacefox.perftests.quarkus.core.port.data.Entity67DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service67.model.Model67;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service67 {

    private final Entity67DatasourcePort datasource;

    public Service67(Entity67DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model67 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
