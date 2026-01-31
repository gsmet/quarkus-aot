package fr.spacefox.perftests.quarkus.core.service966;

import fr.spacefox.perftests.quarkus.core.port.data.Entity966DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service966.model.Model966;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service966 {

    private final Entity966DatasourcePort datasource;

    public Service966(Entity966DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model966 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
