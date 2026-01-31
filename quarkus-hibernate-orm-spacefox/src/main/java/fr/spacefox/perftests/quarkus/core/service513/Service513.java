package fr.spacefox.perftests.quarkus.core.service513;

import fr.spacefox.perftests.quarkus.core.port.data.Entity513DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service513.model.Model513;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service513 {

    private final Entity513DatasourcePort datasource;

    public Service513(Entity513DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model513 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
